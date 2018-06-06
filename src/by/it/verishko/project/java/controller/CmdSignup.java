package by.it.verishko.project.java.controller;

import by.it.verishko.project.java.beans.User;
import by.it.verishko.project.java.dao.DAO;

import javax.servlet.http.HttpServletRequest;

public class CmdSignup extends Cmd {
    @Override
    public Cmd execute(HttpServletRequest req) throws Exception {
        if (Util.isPost(req)) {
            String login = Util.getString(req.getParameter("login"), Pattern.LOGIN);
            String email = Util.getString(req.getParameter("email"), Pattern.EMAIL);
            String password = Util.getString(req.getParameter("password"), Pattern.PASSWORD);
            User user = new User(0, login, password, email, 2);
            DAO dao = DAO.getInstance();
            dao.user.create(user);
            return Actions.LOGIN.command;
        }
        return Actions.LISTGOODS.command;
//        return null;

    }
}
