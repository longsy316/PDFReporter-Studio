/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.editor.action.snap;

import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.preferences.RulersGridPreferencePage;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

public class SnapToGuidesAction extends ACheckResourcePrefAction {
	public static final String ID = "PROPERTY_SNAP_TO_GUIDES_ENABLED"; //$NON-NLS-1$

	public SnapToGuidesAction(JasperReportsConfiguration jrConfig) {
		super(Messages.common_snap_to_guides, jrConfig);
		setText(Messages.common_snap_to_guides);
		setToolTipText(Messages.SnapToGuidesAction_show_grid_tool_tip);
		setId(ID);
	}

	@Override
	protected String getProperty() {
		return RulersGridPreferencePage.P_PAGE_RULERGRID_SNAPTOGUIDES;
	}
}
