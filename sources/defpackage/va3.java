package defpackage;

import android.media.MediaPlayer;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class va3 implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
    public final WeakReference a;

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        try {
            xa3 xa3Var = (xa3) this.a.get();
            if (xa3Var != null) {
                try {
                    pg3 pg3Var = xa3Var.c;
                    if (pg3Var != null) {
                        pg3Var.kgy(xa3Var, i);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euw+gRG9atOtT9NUjSGsKULrPw==", "VeE5nAWlRsmiX9FbiQOpJlzbPZECqGw=", 97);
                    return;
                }
                rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78abQNuHvIiU76WIgYoRhX7zSQEZBg1JRP2VieOa8kX+s/", "VOAPgAW6bNWJRNBonBWhPF4=", 433);
            }
        } catch (Throwable th2) {
            rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78abQNuHvIiU76WIgYoRhX7zSQEZBg1JRP2VieOa8kX+s/", "VOAPgAW6bNWJRNBonBWhPF4=", 433);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        try {
            xa3 xa3Var = (xa3) this.a.get();
            if (xa3Var != null) {
                try {
                    mg3 mg3Var = xa3Var.b;
                    if (mg3Var != null) {
                        mg3Var.kgy(xa3Var);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euw+gRG9atOtT9NUjSGsKULrPw==", "VeE5nAWlRsmjRdpNgBS0IVTg", 88);
                    return;
                }
                rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78abQNuHvIiU76WIgYoRhX7zSQEZBg1JRP2VieOa8kX+s/", "VOAOmg6sZcKUQ9hT", 445);
            }
        } catch (Throwable th2) {
            rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78abQNuHvIiU76WIgYoRhX7zSQEZBg1JRP2VieOa8kX+s/", "VOAOmg6sZcKUQ9hT", 445);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        boolean z;
        try {
            xa3 xa3Var = (xa3) this.a.get();
            if (xa3Var != null) {
                try {
                    sg3 sg3Var = xa3Var.f;
                    z = sg3Var != null && sg3Var.kgy(xa3Var, i, i2);
                } catch (Throwable th) {
                    rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euw+gRG9atOtT9NUjSGsKULrPw==", "VeE5nAWlRsmlWMVSng==", 126);
                }
                if (z) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78abQNuHvIiU76WIgYoRhX7zSQEZBg1JRP2VieOa8kX+s/", "VOAIhxGzew==", 395);
            return false;
        }
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        boolean z;
        try {
            xa3 xa3Var = (xa3) this.a.get();
            if (xa3Var != null) {
                try {
                    ug3 ug3Var = xa3Var.g;
                    z = ug3Var != null && ug3Var.ahm(xa3Var, i, i2);
                } catch (Throwable th) {
                    rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euw+gRG9atOtT9NUjSGsKULrPw==", "VeE5nAWlRsmpRNFS", 135);
                }
                if (z) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78abQNuHvIiU76WIgYoRhX7zSQEZBg1JRP2VieOa8kX+s/", "VOAEmwWz", 382);
            return false;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            xa3 xa3Var = (xa3) this.a.get();
            if (xa3Var != null) {
                try {
                    ng3 ng3Var = xa3Var.a;
                    if (ng3Var != null) {
                        ng3Var.ahm(xa3Var);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euw+gRG9atOtT9NUjSGsKULrPw==", "VeE5nAWlRsmwWNJNjQOlLA==", 79);
                    return;
                }
                rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78abQNuHvIiU76WIgYoRhX7zSQEZBg1JRP2VieOa8kX+s/", "VOAdhwasaNWFTg==", 457);
            }
        } catch (Throwable th2) {
            rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78abQNuHvIiU76WIgYoRhX7zSQEZBg1JRP2VieOa8kX+s/", "VOAdhwasaNWFTg==", 457);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        try {
            xa3 xa3Var = (xa3) this.a.get();
            if (xa3Var != null) {
                try {
                    qg3 qg3Var = xa3Var.d;
                    if (qg3Var != null) {
                        qg3Var.rz(xa3Var);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euw+gRG9atOtT9NUjSGsKULrPw==", "VeE5nAWlRsmzT9JWrx6tOFfrOZA=", 106);
                    return;
                }
                rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78abQNuHvIiU76WIgYoRhX7zSQEZBg1JRP2VieOa8kX+s/", "VOAekAa3SsiNWttYmBQ=", 421);
            }
        } catch (Throwable th2) {
            rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78abQNuHvIiU76WIgYoRhX7zSQEZBg1JRP2VieOa8kX+s/", "VOAekAa3SsiNWttYmBQ=", 421);
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            xa3 xa3Var = (xa3) this.a.get();
            if (xa3Var != null) {
                try {
                    vg3 vg3Var = xa3Var.e;
                    if (vg3Var != null) {
                        vg3Var.kgy(xa3Var, i, i2, 1, 1);
                    }
                } catch (Throwable th) {
                    rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euw+gRG9atOtT9NUjSGsKULrPw==", "VeE5nAWlRsm2Q9NYgyKpMl7NJZQNu2zD", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                }
            }
        } catch (Throwable th2) {
            rz.kgy(th2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5c3lmJHrAkWvcohw==", "euAphwy1beqFTt5cvB2hMV78abQNuHvIiU76WIgYoRhX7zSQEZBg1JRP2VieOa8kX+s/", "VOAbnAe5ZvSJUNJ+hBCuL17q", 409);
        }
    }

    public va3(xa3 xa3Var) {
        this.a = new WeakReference(xa3Var);
    }
}
