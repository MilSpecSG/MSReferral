/*
 *   Referral - AnvilPowered
 *   Copyright (C) 2020 Cableguy20
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.anvilpowered.referral.api.data.key;

import org.anvilpowered.anvil.api.data.key.Key;
import org.anvilpowered.anvil.api.data.key.Keys;

public class ReferralKeys {

    public static final Key<String> FROM_PERMISSION = new Key<String>("FROM_PERMISSION", "referral.user.from") {
    };
    public static final Key<String> INFO_PERMISSION = new Key<String>("INFO_PERMISSION", "referral.admin.info") {
    };

    static {
        Keys.registerKey(FROM_PERMISSION);
        Keys.registerKey(INFO_PERMISSION);
    }
}
