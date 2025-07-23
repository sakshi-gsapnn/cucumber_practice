package factory;

import pages.LoginPage;
import pages.AccountPage;

public class PageFactory {

	static ThreadLocal<LoginPage> LoginPageTL = new ThreadLocal<LoginPage>();
	static ThreadLocal<AccountPage> AccountsPageTL = new ThreadLocal<AccountPage>();

	public static LoginPage getLoginPage() {
		if (LoginPageTL.get() == null) {
			LoginPageTL.set(new LoginPage());
		}
		return LoginPageTL.get();
	}

	public static AccountPage getAccountsPage() {
		if (AccountsPageTL.get() == null) {
			AccountsPageTL.set(new AccountPage());
		}
		return AccountsPageTL.get();
	}
}
