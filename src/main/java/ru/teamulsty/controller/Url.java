package ru.teamulsty.controller;

public interface Url {

    interface PageRequest {
        String ROOT = "";
        String AUTH = "/auth";
        String ADMIN_MENU = "/admin-menu";
        String ACCOUNT_CHOOSE = "/add-account";
        String CONTRACTOR = "/contractor";
        String CUSTOMER = "/customer";
        String TENDERS = "/tenders";
        String TENDER_INFO ="/tender-info";
        String CUSTOMER_MENU ="/customer-menu";
    }

    interface AuthRequest {
        String ROOT = "/auth";
        String LOGIN = "/login";
        String REGISTRATION = "/reg";
    }

    interface ContractorController {
        String ROOT = "/contractors";
    }

    interface CustomerController {
        String ROOT = "/customers";
    }

    interface Tender {
        String ROOT = "/tenders";
        String SUBSCRIBE = "/subscribe";
    }
}
