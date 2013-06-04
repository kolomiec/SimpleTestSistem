package simpletestsystem

class Answers {

    String answer
    Boolean isTrue

    static belongsTo = [questions:Questions]
    static hasMany = [userAnswers:UserAnswers]

    static constraints = {
        answer (blank: false)
        isTrue (blank: false)
    }
}
