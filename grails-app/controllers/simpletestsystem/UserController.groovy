package simpletestsystem

class UserController {

    def list() {
        render view:"/user/list", model: [users:Users.list()]
    }
}
