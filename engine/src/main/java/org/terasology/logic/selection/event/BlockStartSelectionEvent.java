/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.logic.selection.event;

import org.terasology.entitySystem.event.AbstractConsumableEvent;
import org.terasology.logic.selection.BlockSelectionComponent;

/**
 * Sent to BlockSelectionSystem to indicate that the current sender should be used as the selection starting position
 */
public class BlockStartSelectionEvent extends AbstractConsumableEvent {

    private BlockSelectionComponent blockSelectionComponent;

    public BlockStartSelectionEvent(BlockSelectionComponent blockSelectionComponent) {
        this.blockSelectionComponent = blockSelectionComponent;
    }

    public BlockSelectionComponent getBlockSelectionComponent() {
        return blockSelectionComponent;
    }

}
