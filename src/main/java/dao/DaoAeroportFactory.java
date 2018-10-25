package dao;

public class DaoAeroportFactory {
	private static DaoAeroport daoAeroport;

	private DaoAeroportFactory() {

	}

	public static DaoAeroport getInstance() {
		if (daoAeroport == null) {
			daoAeroport = new DaoAeroportJpaImpl();
		}
		return daoAeroport;
	}

}
