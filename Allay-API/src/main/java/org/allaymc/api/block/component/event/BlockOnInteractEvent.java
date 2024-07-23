package org.allaymc.api.block.component.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.allaymc.api.block.component.common.PlayerInteractInfo;
import org.allaymc.api.block.data.BlockStateWithPos;
import org.allaymc.api.eventbus.event.Event;
import org.allaymc.api.item.ItemStack;

/**
 * Allay Project 2023/9/23
 *
 * @author daoge_cmd
 */
@Getter
@AllArgsConstructor
public final class BlockOnInteractEvent extends Event {
    private final BlockStateWithPos blockStateWithPos;
    private final ItemStack itemStack;
    private final PlayerInteractInfo interactInfo;
    @Setter
    private boolean success;
}
