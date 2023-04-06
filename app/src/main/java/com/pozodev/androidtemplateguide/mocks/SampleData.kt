package com.pozodev.guideandroid.mocks

import com.pozodev.guideandroid.models.Message

class SampleData() {
    var messages: ArrayList<Message> = arrayListOf()

    init {
        messages.add(Message("Sergio", "Lorem ipsum!"))
        messages.add(Message("Alba", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        messages.add(Message("Montserrat", "Morbi commodo justo eros, non dictum nibh fermentum eu. Nunc vitae congue orci. Vestibulum pretium orci non sem ultricies gravida."))
        messages.add(Message("Emilio", "Nulla varius"))
        messages.add(Message("Ramon", "Nulla varius tortor et ullamcorper fermentum. Duis tristique porttitor massa, elementum gravida lorem scelerisque at"))
        messages.add(Message("Ron", "Vestibulum vitae eros ac sapien eleifend gravida. Maecenas iaculis nunc non dui cursus scelerisque. Phasellus tempor neque eu dictum efficitur. Curabitur lectus mauris, congue ut tortor vitae, molestie interdum erat."))
    }
}