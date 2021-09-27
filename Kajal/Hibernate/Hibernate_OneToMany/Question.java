package com.hibernate.entity;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String questionname;

	// creating col on anwers table
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "qid")
	@OrderColumn(name = "type")// use to  maintain the order of list
	private List<Answer> answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public String getQuestionname() {
		return questionname;
	}

	public void setQuestionname(String questionname) {
		this.questionname = questionname;
	}
}