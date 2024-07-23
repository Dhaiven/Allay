package org.allaymc.server.block.component;

import org.allaymc.api.block.BlockBehavior;
import org.allaymc.api.block.component.common.PlayerInteractInfo;
import org.allaymc.api.block.data.BlockStateWithPos;
import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.container.FullContainerType;
import org.allaymc.api.item.ItemStack;
import org.allaymc.server.block.component.common.BlockBaseComponentImpl;

/**
 * Allay Project 2023/12/6
 *
 * @author daoge_cmd
 */
public class BlockCraftingTableBaseComponentImpl extends BlockBaseComponentImpl {
    public BlockCraftingTableBaseComponentImpl(BlockType<? extends BlockBehavior> blockType) {
        super(blockType);
    }

    @Override
    public boolean onInteract(BlockStateWithPos blockState, ItemStack itemStack, PlayerInteractInfo interactInfo) {
        if (super.onInteract(blockState, itemStack, interactInfo)) return true;
        if (interactInfo == null) return false;

        var player = interactInfo.player();
        var craftingTableContainer = player.getContainer(FullContainerType.CRAFTING_TABLE);
        craftingTableContainer.setBlockPos(blockState.pos());
        craftingTableContainer.addViewer(player);
        return true;
    }
}
