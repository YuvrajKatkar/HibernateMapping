package BiManyToMant;

import BiDTO.CourseBi;

public class CourseBiDAO {
	public CourseBi fetchCourse(int id) {
		CourseBi courseBi = StudentBiDAO.entityManager.find(CourseBi.class, id);
		return courseBi;
		
	}

}
