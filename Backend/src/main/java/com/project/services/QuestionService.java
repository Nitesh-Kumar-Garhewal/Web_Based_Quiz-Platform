package com.project.services;

import com.project.models.Question;
import com.project.models.Quiz;

import java.util.List;

public interface QuestionService {

    Question addQuestion(Question question);

    List<Question> getQuestions();

    Question getQuestion(Long quesId);

    Question updateQuestion(Question question);

    void deleteQuestion(Long questionId);

  
    List<Question> getQuestionsByQuiz(Quiz quiz);

}
