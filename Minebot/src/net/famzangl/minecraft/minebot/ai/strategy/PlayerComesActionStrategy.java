/*******************************************************************************
 * This file is part of Minebot.
 *
 * Minebot is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Minebot is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Minebot.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package net.famzangl.minecraft.minebot.ai.strategy;

import net.famzangl.minecraft.minebot.ai.AIHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerComesActionStrategy extends CloseEntityActionStrategy {

	@Override
	protected boolean matches(AIHelper helper, Entity player) {
		return player instanceof EntityPlayer && player != helper.getMinecraft().player;
	}

	@Override
	protected String getSettingPrefix() {
		return "on_player_comes_";
	}

	@Override
	public String getDescription(AIHelper helper) {
		return "Check if other player is coming.";
	}
}
