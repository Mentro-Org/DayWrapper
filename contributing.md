
## Contributions Best Practices

Please help us follow the best practice to make it easy for the reviewer as well as the contributor. We want to focus on the code quality more than on managing pull request ethics.

* Reference the issue numbers in the commit message. Follow the pattern ``` Fixes #<issue number> <commit message>```
* Follow uniform design practices. The design language must be consistent throughout the app.
* The pull request will not get merged if there are any merge conflicts. In case there is any, you have to consciously update your PR accordingly and update maintainers.
* If the PR is related to any front end change, please attach relevant screenshots in the pull request description.
* Before you join development, please set up the project on your local machine, run it and go through the application completely. Press on any button you can find and see where it leads to. Explore.
* If you would like to work on an issue, drop in a comment at the issue. If it is already assigned to someone, but there is no sign of any work being done, please free to start working on it.

## Branch Policy

We have the following branches
* **development** All development goes on in this branch. If you're making a contribution, you are supposed to make a pull request to _development_. PRs to development branch must pass a build check and a unit-test check on Circle CI.
* **master** This contains shipped code. After significant features/bugfixes are accumulated on development, we make a version update and make a release.
