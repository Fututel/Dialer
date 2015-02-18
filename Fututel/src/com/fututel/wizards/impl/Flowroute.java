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


public class Flowroute extends AuthorizationImplementation {

	@Override
	protected String getDefaultName() {
		return "Flowroute";
	}
	
	//Customization
	@Override
	public void fillLayout(final SipProfile account) {
		super.fillLayout(account);
		
		accountUsername.setTitle(R.string.w_advanced_caller_id);
		accountUsername.setDialogTitle(R.string.w_advanced_caller_id);
		accountUsername.getEditText().setInputType(InputType.TYPE_CLASS_PHONE);
		
		
		accountAuthorization.setTitle(R.string.w_common_username);
		accountAuthorization.setDialogTitle(R.string.w_common_username);
		accountAuthorization.getEditText().setInputType(InputType.TYPE_CLASS_PHONE);
		

		hidePreference(null, SERVER);
	}
	

	@Override
	public String getDefaultFieldSummary(String fieldName) {
		if(fieldName.equals(USER_NAME)) {
			return parent.getString(R.string.w_advanced_caller_id_desc);
		}else if(fieldName.equals(AUTH_NAME)) {
		    return parent.getString(R.string.w_authorization_auth_name_desc);
		}
		return super.getDefaultFieldSummary(fieldName);
	}
	
	
	public SipProfile buildAccount(SipProfile account) {
		account = super.buildAccount(account);
		account.transport = SipProfile.TRANSPORT_UDP;
		return account;
	}
	
	public boolean canSave() {
		boolean isValid = true;
		
		isValid &= checkField(accountDisplayName, isEmpty(accountDisplayName));
		isValid &= checkField(accountUsername, isEmpty(accountUsername));
		isValid &= checkField(accountAuthorization, isEmpty(accountAuthorization));
		isValid &= checkField(accountPassword, isEmpty(accountPassword));

		return isValid;
	}

	protected String getDomain() {
		return "sip.flowroute.com";
	}
}
