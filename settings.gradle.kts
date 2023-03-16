rootProject.name = "lab1"
include("src:main:Tests")
findProject(":src:main:Tests")?.name = "Tests"
