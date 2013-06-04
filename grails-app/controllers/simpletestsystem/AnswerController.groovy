package simpletestsystem

class AnswerController {

    def index() {}

    def list() {
        model: [answers:Answers.list()]
    }
}
