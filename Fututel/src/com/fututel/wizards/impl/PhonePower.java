/**
 * Copyright (C) 2010-2012 Regis Montoya (aka r3gis - www.r3gis.fr)
 * This file is part of Fututel.
 *
 *  Fututel is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  If you own a pjsip commercial license you can also redistribute it
 *  and/or modify it under the terms of the GNU Lesser General Public License
 *  as an android library.
 *
 *  Fututel is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Fututel.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.fututel.wizards.impl;

import android.text.InputType;

import com.fututel.R;
import com.fututel.api.SipProfile;

public class PhonePower extends SimpleImplementation {

    @Override
    protected String getDefaultName() {
        return "Phone power";
    }

    @Override
    protected String getDomain() {
        return "208.64.8.6:12060";
    }

    @Override
    public void fillLayout(final SipProfile account) {
        super.fillLayout(account);

        accountUsername.setTitle(R.string.w_common_phone_number);
        accountUsername.setDialogTitle(R.string.w_common_phone_number);
        accountUsername.getEditText().setInputType(InputType.TYPE_CLASS_PHONE);
    }

    @Override
    public String getDefaultFieldSummary(String fieldName) {
        if (fieldName.equals(USER_NAME)) {
            return parent.getString(R.string.w_common_phone_number_desc);
        }
        return super.getDefaultFieldSummary(fieldName);
    }

    public SipProfile buildAccount(SipProfile account) {
        account = super.buildAccount(account);
        account.allow_contact_rewrite = false;
        account.try_clean_registers = 0;
        return account;
    }

}