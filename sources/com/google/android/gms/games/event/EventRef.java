package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import com.tiktok.appevents.contents.TTContentsEventConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class EventRef extends DataBufferRef implements Event {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.Freezable
    @NonNull
    public final /* synthetic */ Event freeze() {
        return new EventEntity(this);
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public final String getDescription() {
        return getString(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION);
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public final String getEventId() {
        return getString("external_event_id");
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public final String getFormattedValue() {
        return getString("formatted_value");
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public final Uri getIconImageUri() {
        return parseUri("icon_image_uri");
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String getIconImageUrl() {
        return getString("icon_image_url");
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public final String getName() {
        return getString("name");
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public final Player getPlayer() {
        return new PlayerRef(this.mDataHolder, this.mDataRow, null);
    }

    @Override // com.google.android.gms.games.event.Event
    public final long getValue() {
        return getLong("value");
    }

    @Override // com.google.android.gms.games.event.Event
    public final boolean isVisible() {
        return getBoolean("visibility");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        new EventEntity(this).writeToParcel(parcel, i);
    }

    public EventRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(@Nullable Object obj) {
        return EventEntity.zzb(this, obj);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return EventEntity.zza(this);
    }

    @NonNull
    public final String toString() {
        return EventEntity.zzc(this);
    }

    @Override // com.google.android.gms.games.event.Event
    public final void getDescription(@NonNull CharArrayBuffer charArrayBuffer) {
        copyToBuffer(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    public final void getFormattedValue(@NonNull CharArrayBuffer charArrayBuffer) {
        copyToBuffer("formatted_value", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    public final void getName(@NonNull CharArrayBuffer charArrayBuffer) {
        copyToBuffer("name", charArrayBuffer);
    }
}
