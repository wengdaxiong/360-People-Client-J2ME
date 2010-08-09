/*******************************************************************************
 * CDDL HEADER START
 * 
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 * 
 * You can obtain a copy of the license at
 * src/com/vodafone360/people/VODAFONE.LICENSE.txt or
 * http://github.com/360/360-Engine-for-Android
 * See the License for the specific language governing permissions and limitations under the License.
 * 
 * When distributing Covered Code, include this CDDL HEADER in each file and
 *  include the License file at src/com/vodafone360/people/VODAFONE.LICENSE.txt.
 * If applicable, add the following below this CDDL HEADER, with the fields
 * enclosed by brackets "[]" replaced with your own identifying information:
 * Portions Copyright [yyyy] [name of copyright owner]
 * 
 * CDDL HEADER END
 * 
 * Copyright 2010 Vodafone Sales & Services Ltd.  All rights reserved.
 * Use is subject to license terms.
 ******************************************************************************/
package com.zyb.nowplus.data.email.commands;

import com.zyb.nowplus.data.email.response.EmailResponse;

/**
 * 
 * @author Jens Vesti
 */
public abstract class EmailCommand {

	protected static int globalCommandCounter = 0;
	
	private final String commandId;
	
	public EmailCommand() {
		commandId = "C"+globalCommandCounter++;
	}
	
	public String getCurrentId() {
		return commandId;
	}
	
	public abstract byte[][] getSerialisedCommand();

	public abstract EmailResponse createResponse(String response);
}
