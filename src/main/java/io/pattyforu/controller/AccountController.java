package io.pattyforu.controller;

import io.pattyforu.domain.Account;
import io.pattyforu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("testfindAll")
    public String testfindAll(Model model) {
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts", accounts);
        System.out.println("表现层: 查询所有用户");
        return "list";
    }

    @RequestMapping("testSaveAccount")
    public String testSaveAccount(Account account) {
        accountService.saveAccount(account);
        System.out.println("表现层: 查询所有用户");
        return "redirect:/account/testfindAll";
    }
}
