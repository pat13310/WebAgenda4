package com.xenatronics.webagenda.domain.usecase.contact

import com.xenatronics.webagenda.domain.model.Contact
import com.xenatronics.webagenda.data.repository.RepositoryContact
import com.xenatronics.webagenda.domain.model.ResponseSimple

class UpdateContact(val repository:RepositoryContact) {
    suspend operator fun invoke(contact: Contact):ResponseSimple =  repository.Update(contact)
}
