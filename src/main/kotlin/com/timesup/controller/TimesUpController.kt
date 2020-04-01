package com.timesup.controller


import com.timesup.dto.AddNewName
import com.timesup.dto.AddNewNameResponse
import com.timesup.dto.ValidateList
import com.timesup.services.TimesUpService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@CrossOrigin
@RestController
@RequestMapping("/timesup")
class TimesUpController {

    @Autowired
    lateinit var timesUpService: TimesUpService

    @PostMapping("/add_name")
    fun newNameAdd(@RequestBody dto: AddNewName): AddNewNameResponse {
        return timesUpService.addNewName(dto.newName)
    }

    @GetMapping("/shuffle")
    fun shuffle(): AddNewNameResponse {
        return timesUpService.shuffle()
    }

    @GetMapping("/startnewround")
    fun start(): AddNewNameResponse {
        return timesUpService.startNewRound()
    }

    @PostMapping("/founded")
    fun founded(@RequestBody valueFounded: AddNewName): AddNewNameResponse {

        return AddNewNameResponse(timesUpService.found(valueFounded.newName))
    }

    @PostMapping("/validermots")
    fun pass(@RequestBody valuePassed: ValidateList): AddNewNameResponse {
        timesUpService.validermots(valuePassed.motsList)
        return AddNewNameResponse("OK")
    }
    @PostMapping("/chronoEnded")
    fun chronoEnded(@RequestBody valuePassed: AddNewName): AddNewNameResponse {

        return AddNewNameResponse(timesUpService.chronoEnded(valuePassed.newName))
    }
}