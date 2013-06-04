package simpletestsystem

class QuestionController {

    def index() {}

    def list() {
        model: [question:Questions.list()]
    }
}
