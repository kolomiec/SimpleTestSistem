package simpletestsystem

class Questions {

    String question;

    static hasMany = [answers:Answers]

    static constraints = {
        question (blank: false)
    }
}
