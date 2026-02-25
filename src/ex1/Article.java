package ex1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Article extends Document{
	private LocalDateTime date_cree;
	private LocalDateTime date_maj;
	
	public Article (Article a ) {
		super(a);
		this.date_cree=a.date_cree;
		this.date_maj=a.date_maj;
	}
	
	public Article (int numensg , String titre , LocalDateTime date_cree ,LocalDateTime date_maj) {
		super(numensg , titre);
		this.date_cree=date_cree;
		this.date_maj=date_maj;
	}

	public LocalDateTime getDate_cree() {
		return date_cree;
	}

	public void setDate_cree(LocalDateTime date_cree) {
		this.date_cree = date_cree;
	}

	public LocalDateTime getDate_maj() {
		return date_maj;
	}

	public void setDate_maj(LocalDateTime date_maj) {
		this.date_maj = date_maj;
	}
	
	public void afficher() {
		System.out.println("\n date de creation"+" "+date_cree+"\n date de mise a jour"+" "+date_maj);
		
	}

	
	

}
