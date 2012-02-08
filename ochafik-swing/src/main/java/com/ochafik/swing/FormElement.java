/*
	Copyright (c) 2009-2011 Olivier Chafik, All Rights Reserved
	
	This file is part of JNAerator (http://jnaerator.googlecode.com/).
	
	JNAerator is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.
	
	JNAerator is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.
	
	You should have received a copy of the GNU General Public License
	along with JNAerator.  If not, see <http://www.gnu.org/licenses/>.
*/
package com.ochafik.swing;

import java.awt.Component;

public final class FormElement {
    public String name, title, toolTip, propertyName;
    public boolean largeComponent;
    public Component editorComponent;
    public FormElement(String name, Component editorComponent) {
        this.name=name;
        this.editorComponent=editorComponent;
    }
    public FormElement(String name, String propertyName) {
        this(name,propertyName,false);
    }
    public FormElement(String name, String propertyName,boolean largeComponent) {
        this(name,null,null,propertyName,largeComponent);
    }
    public FormElement(String name, String title, String toolTip, String propertyName,boolean largeComponent) {
            this.name=name;
        this.title=title;
        this.toolTip=toolTip;
        this.propertyName=propertyName;
        this.largeComponent=largeComponent;
    }
}