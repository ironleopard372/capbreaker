package com.controllers;

import com.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class AdviceController {

    private final AgentService agentService;

    @Autowired
    public AdviceController(AgentService agentService) {
        this.agentService = agentService;
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("agents", "Online agents: " + agentService.agentCounter());
    }
}
