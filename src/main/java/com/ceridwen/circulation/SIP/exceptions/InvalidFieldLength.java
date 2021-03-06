/*******************************************************************************
 * Copyright (c) 2010 Matthew J. Dovey (www.ceridwen.com).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at 
 * <http://www.gnu.org/licenses/>
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Matthew J. Dovey (www.ceridwen.com) - initial API and implementation
 ******************************************************************************/
package com.ceridwen.circulation.SIP.exceptions;

public class InvalidFieldLength extends Exception {

    /**
	 * 
	 */
    private static final long serialVersionUID = 5690108640895112742L;
    private String field;
    private int maxLength;

    public InvalidFieldLength(String field, int maxLength) {
        this.field = field;
        this.maxLength = maxLength;
    }

    @Override
    public String getMessage() {
        return this.field + " - Field Length: " + this.maxLength + " characters";
    }
}
