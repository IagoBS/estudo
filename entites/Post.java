package entites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
private static SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY HH:mm:ss");
private Date data;
private String title;
private String conttent;
private Integer likes;
private List<Coment> comment = new ArrayList<>();

@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(title + "\n");
	sb.append(likes );
	sb.append("Likes - " + "\n");
	sb.append(sdf.format(data) +"\n");
	sb.append(conttent + "\n");
	sb.append(comment + "\n");
	for (Coment c: comment) {
		sb.append(c.getText());
	}
	return sb.toString();
	
	
}
public Post() {
	
}
public Post(Date data, String title, String conttent, Integer likes) {
	
	this.data = data;
	this.title = title;
	this.conttent = conttent;
	this.likes = likes;
}
public Date getData() {
	return data;
}
public void setData(Date data) {
	this.data = data;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getConttent() {
	return conttent;
}
public void setConttent(String conttent) {
	this.conttent = conttent;
}
public Integer getLikes() {
	return likes;
}
public void setLikes(Integer likes) {
	this.likes = likes;
}
public List<Coment> getComment() {
	return comment;
}
public void addcoment(Coment coment) {
	comment.add(coment);
}
public void removecoment(Coment coment) {
comment.remove(coment);
}





}
