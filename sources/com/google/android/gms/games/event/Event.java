package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Player;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@VisibleForTesting
public interface Event extends Freezable<Event>, Parcelable {
    @NonNull
    String getDescription();

    void getDescription(@NonNull CharArrayBuffer charArrayBuffer);

    @NonNull
    String getEventId();

    @NonNull
    String getFormattedValue();

    void getFormattedValue(@NonNull CharArrayBuffer charArrayBuffer);

    @NonNull
    Uri getIconImageUri();

    @NonNull
    @KeepName
    @Deprecated
    String getIconImageUrl();

    @NonNull
    String getName();

    void getName(@NonNull CharArrayBuffer charArrayBuffer);

    @NonNull
    Player getPlayer();

    long getValue();

    boolean isVisible();
}
