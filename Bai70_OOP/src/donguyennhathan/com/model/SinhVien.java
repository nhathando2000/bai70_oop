package donguyennhathan.com.model;

public class SinhVien implements ILamViec, IGiaiTri {

	@Override
	public void complecity() {
		System.out.println("Công việc phức tập");
	}

	@Override
	public void difficulty() {
		System.out.println("Công việc khó");
	}

	@Override
	public void hatHo() {
		System.out.println("Giải trí");
	}
	
}
