# Gradle Task Adapter

This is a library that provides a task configuration adapter library from the Gradle `2.14.1` API
all the way to the new Gradle `4.10` API.

This allows plugin developers to utilize both the old API for legacy plugin customers
and allows users on the newest version of Gradle to take advantage of the new
[Task Configuration API](https://docs.gradle.org/current/userguide/task_configuration_avoidance.html).
