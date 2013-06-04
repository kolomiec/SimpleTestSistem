package simpletestsystem

class Users {

    String userName

    static hasMany = [userAnswers:UserAnswers]

    static constraints = {
        userName (blank: false)
    }
}
