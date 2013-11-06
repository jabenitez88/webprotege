package edu.stanford.bmir.protege.web.client.actionbar.application;

import edu.stanford.bmir.protege.web.client.mail.ChangeEmailAddressPresenter;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 06/11/2013
 */
public class ChangeEmailAddressHandlerImpl implements ChangeEmailAddressHandler {

    @Override
    public void handleChangeEmailAddress() {
        ChangeEmailAddressPresenter presenter = new ChangeEmailAddressPresenter();
        presenter.changeEmail();
    }
}
