package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import coil.memory.MemoryCache$Key;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.GameRequestContent;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.datepicker.DateValidatorPointForward;
import defpackage.d7;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class d7 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ d7(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle = null;
        switch (this.a) {
            case 0:
                return new ApicFrame(parcel);
            case 1:
                return new AppInfoTable(parcel.readInt(), (String) Assertions.checkNotNull(parcel.readString()));
            case 2:
                BadgeState$State badgeState$State = new BadgeState$State();
                badgeState$State.i = 255;
                badgeState$State.k = -2;
                badgeState$State.l = -2;
                badgeState$State.m = -2;
                badgeState$State.t = Boolean.TRUE;
                badgeState$State.a = parcel.readInt();
                badgeState$State.b = (Integer) parcel.readSerializable();
                badgeState$State.c = (Integer) parcel.readSerializable();
                badgeState$State.d = (Integer) parcel.readSerializable();
                badgeState$State.e = (Integer) parcel.readSerializable();
                badgeState$State.f = (Integer) parcel.readSerializable();
                badgeState$State.g = (Integer) parcel.readSerializable();
                badgeState$State.h = (Integer) parcel.readSerializable();
                badgeState$State.i = parcel.readInt();
                badgeState$State.j = parcel.readString();
                badgeState$State.k = parcel.readInt();
                badgeState$State.l = parcel.readInt();
                badgeState$State.m = parcel.readInt();
                badgeState$State.o = parcel.readString();
                badgeState$State.p = parcel.readString();
                badgeState$State.q = parcel.readInt();
                badgeState$State.s = (Integer) parcel.readSerializable();
                badgeState$State.u = (Integer) parcel.readSerializable();
                badgeState$State.v = (Integer) parcel.readSerializable();
                badgeState$State.w = (Integer) parcel.readSerializable();
                badgeState$State.x = (Integer) parcel.readSerializable();
                badgeState$State.y = (Integer) parcel.readSerializable();
                badgeState$State.z = (Integer) parcel.readSerializable();
                badgeState$State.C = (Integer) parcel.readSerializable();
                badgeState$State.A = (Integer) parcel.readSerializable();
                badgeState$State.B = (Integer) parcel.readSerializable();
                badgeState$State.t = (Boolean) parcel.readSerializable();
                badgeState$State.n = (Locale) parcel.readSerializable();
                badgeState$State.D = (Boolean) parcel.readSerializable();
                return badgeState$State;
            case 3:
                return new BinaryFrame(parcel);
            case 4:
                parcel.getClass();
                return new CameraEffectArguments(parcel);
            case 5:
                parcel.getClass();
                return new CameraEffectTextures(parcel);
            case 6:
                return new ChapterFrame(parcel);
            case 7:
                return new ChapterTocFrame(parcel);
            case 8:
                return new CommentFrame(parcel);
            case 9:
                return new DateValidatorPointForward(parcel.readLong());
            case 10:
                return new DrmInitData(parcel);
            case 11:
                return new EventMessage(parcel);
            case 12:
                parcel.getClass();
                return new GameRequestContent(parcel);
            case 13:
                return new GeobFrame(parcel);
            case 14:
                return new IcyHeaders(parcel);
            case 15:
                return new IcyInfo(parcel);
            case 16:
                return new InternalFrame(parcel);
            case 17:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new d7(17);
                    public final int a;
                    public final MediaDescriptionCompat b;

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.a);
                        this.b.writeToParcel(parcel2, i);
                    }

                    {
                        this.a = parcel.readInt();
                        this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                };
            case 18:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = xj1.g(mediaDescription);
                CharSequence charSequenceI = xj1.i(mediaDescription);
                CharSequence charSequenceH = xj1.h(mediaDescription);
                CharSequence charSequenceC = xj1.c(mediaDescription);
                Bitmap bitmapE = xj1.e(mediaDescription);
                Uri uriF = xj1.f(mediaDescription);
                Bundle bundleD = xj1.d(mediaDescription);
                if (bundleD != null) {
                    bundleD = lk1.b(bundleD);
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (!bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleD.size() != 2) {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = yj1.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.i = mediaDescription;
                return mediaDescriptionCompat;
            case 19:
                return new MediaMetadataCompat(parcel);
            case 20:
                return new MediaSessionCompat$QueueItem(parcel);
            case 21:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 22:
                String string = parcel.readString();
                string.getClass();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 < i; i2++) {
                    String string2 = parcel.readString();
                    string2.getClass();
                    String string3 = parcel.readString();
                    string3.getClass();
                    linkedHashMap.put(string2, string3);
                }
                return new MemoryCache$Key(string, linkedHashMap);
            case 23:
                return new Metadata(parcel);
            case 24:
                return new MlltFrame(parcel);
            case 25:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.a = parcel.readInt();
                parcelableVolumeInfo.c = parcel.readInt();
                parcelableVolumeInfo.d = parcel.readInt();
                parcelableVolumeInfo.e = parcel.readInt();
                parcelableVolumeInfo.b = parcel.readInt();
                return parcelableVolumeInfo;
            case 26:
                return new PictureFrame(parcel);
            case 27:
                return new PlaybackStateCompat(parcel);
            case 28:
                return new PrivFrame(parcel);
            default:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ApicFrame[i];
            case 1:
                return new AppInfoTable[i];
            case 2:
                return new BadgeState$State[i];
            case 3:
                return new BinaryFrame[i];
            case 4:
                return new CameraEffectArguments[i];
            case 5:
                return new CameraEffectTextures[i];
            case 6:
                return new ChapterFrame[i];
            case 7:
                return new ChapterTocFrame[i];
            case 8:
                return new CommentFrame[i];
            case 9:
                return new DateValidatorPointForward[i];
            case 10:
                return new DrmInitData[i];
            case 11:
                return new EventMessage[i];
            case 12:
                return new GameRequestContent[i];
            case 13:
                return new GeobFrame[i];
            case 14:
                return new IcyHeaders[i];
            case 15:
                return new IcyInfo[i];
            case 16:
                return new InternalFrame[i];
            case 17:
                return new MediaBrowserCompat$MediaItem[i];
            case 18:
                return new MediaDescriptionCompat[i];
            case 19:
                return new MediaMetadataCompat[i];
            case 20:
                return new MediaSessionCompat$QueueItem[i];
            case 21:
                return new MediaSessionCompat$Token[i];
            case 22:
                return new MemoryCache$Key[i];
            case 23:
                return new Metadata[i];
            case 24:
                return new MlltFrame[i];
            case 25:
                return new ParcelableVolumeInfo[i];
            case 26:
                return new PictureFrame[i];
            case 27:
                return new PlaybackStateCompat[i];
            case 28:
                return new PrivFrame[i];
            default:
                return new RatingCompat[i];
        }
    }
}
