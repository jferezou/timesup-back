package com.timesup.dto

data class AddNewName (
    var newName: String
)
data class ValidateList (
    var motsList: List<ValidateMot>
)
data class ValidateMot (
    var ischeked: Boolean,
    var nom: String
)

data class AddNewNameResponse (
    var returnValue: String
)