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
package com.jaspersoft.studio.components.barcode.property;

import net.sf.jasperreports.components.barcode4j.PDF417Component;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.components.barcode.messages.Messages;
import com.jaspersoft.studio.properties.view.TabbedPropertySheetPage;
import com.jaspersoft.studio.property.section.AbstractSection;

public class PDF417Section extends AbstractSection {

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ITabbedPropertySection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		Composite group = getWidgetFactory().createSection(parent, "PDF417",
				false, 2);

		createWidget4Property(group, PDF417Component.PROPERTY_MIN_COLUMNS);

		createWidget4Property(group, PDF417Component.PROPERTY_MAX_COLUMNS);
		createWidget4Property(group, PDF417Component.PROPERTY_MIN_ROWS);
		createWidget4Property(group, PDF417Component.PROPERTY_MAX_ROWS);

		GridData gd = new GridData();
		gd.horizontalSpan = 3;
		createWidget4Property(group,
				PDF417Component.PROPERTY_ERROR_CORRECTION_LEVEL).getControl()
				.setLayoutData(gd);
	}
	
	@Override
	protected void initializeProvidedProperties() {
		super.initializeProvidedProperties();
		addProvidedProperties(PDF417Component.PROPERTY_MIN_COLUMNS,  Messages.MPDF417_min_columns);
		addProvidedProperties(PDF417Component.PROPERTY_MAX_COLUMNS, Messages.MPDF417_max_columns);
		addProvidedProperties(PDF417Component.PROPERTY_MIN_ROWS, Messages.MPDF417_min_rows);
		addProvidedProperties(PDF417Component.PROPERTY_MAX_ROWS, Messages.MPDF417_max_rows);
		addProvidedProperties(PDF417Component.PROPERTY_ERROR_CORRECTION_LEVEL, Messages.MPDF417_error_correction_level);
	}
}
