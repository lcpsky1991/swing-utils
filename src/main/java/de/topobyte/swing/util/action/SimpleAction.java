// Copyright 2016 Sebastian Kuerten
//
// This file is part of swing-utils.
//
// swing-utils is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// swing-utils is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with swing-utils. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.swing.util.action;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;

/**
 * @author Sebastian Kuerten (sebastian@topobyte.de)
 */
public abstract class SimpleAction extends AbstractAction
{

	private static final long serialVersionUID = 1727617884915345905L;

	/**
	 * The name of this action.
	 */
	protected String name = null;

	/**
	 * The short description of this action.
	 */
	protected String description = null;

	/**
	 * The icon for this action.
	 */
	protected Icon icon = null;

	/**
	 * Create a default SimpleAction that provides only null values
	 */
	public SimpleAction()
	{
		// nothing to be done here
	}

	/**
	 * Create a SimpleAction that provides name and description
	 * 
	 * @param name
	 *            the name of the action.
	 * @param description
	 *            the short description of the action.
	 */
	public SimpleAction(String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	@Override
	public Object getValue(String key)
	{
		if (key.equals(Action.SMALL_ICON)) {
			return icon;
		} else if (key.equals(Action.NAME)) {
			return name;
		} else if (key.equals(Action.SHORT_DESCRIPTION)) {
			return description;
		}
		return null;
	}

	/**
	 * Set the name of this action.
	 * 
	 * @param name
	 *            the new name.
	 */
	protected void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Set the description of this action.
	 * 
	 * @param description
	 *            the new description.
	 */
	protected void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * Set this action's icon.
	 * 
	 * @param filename
	 *            the icon to use.
	 */
	protected void setIcon(Icon icon)
	{
		this.icon = icon;
	}

}
