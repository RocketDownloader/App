/*
 * Copyright (C) 2016 Brian Wernick
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.devbrackets.android.playlistcore.event;

import android.support.annotation.Nullable;

import com.devbrackets.android.playlistcore.manager.IPlaylistItem;

public class PlaylistItemChange<T extends IPlaylistItem> {
    @Nullable
    private final T currentItem;
    private final boolean hasNext;
    private final boolean hasPrevious;

    public PlaylistItemChange(@Nullable T currentItem, boolean hasPrevious, boolean hasNext) {
        this.currentItem = currentItem;
        this.hasPrevious = hasPrevious;
        this.hasNext = hasNext;
    }

    @Nullable
    public T getCurrentItem() {
        return currentItem;
    }

    public boolean hasNext() {
        return hasNext;
    }

    public boolean hasPrevious() {
        return hasPrevious;
    }
}
