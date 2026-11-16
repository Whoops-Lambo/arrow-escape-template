package com.inmobi.signals.adinfo;

import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.inmobi.media.Fk;
import com.inmobi.media.Gk;
import defpackage.zr0;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\u001a\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\t2\u001a\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/inmobi/signals/adinfo/SignalCollector;", "", "", "", "listOfTopics", "<init>", "(Ljava/util/List;)V", "Lkotlin/Function2;", "Landroid/os/Bundle;", "Laz2;", "onEvent", "Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;", "createSubscriber", "(Lzr0;)Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;", "setupAppLovinCommunicator", "(Lzr0;)V", "Ljava/util/List;", "getListOfTopics", "()Ljava/util/List;", "Lcom/applovin/communicator/AppLovinCommunicator;", "communicator", "Lcom/applovin/communicator/AppLovinCommunicator;", "communicatorSubscriber", "Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;", "Companion", "com/inmobi/media/Fk", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SignalCollector {

    @NotNull
    public static final Fk Companion = new Fk();

    @NotNull
    private static final String TAG = "SignalCollector";

    @NotNull
    private final AppLovinCommunicator communicator;

    @Nullable
    private AppLovinCommunicatorSubscriber communicatorSubscriber;

    @NotNull
    private final List<String> listOfTopics;

    private final AppLovinCommunicatorSubscriber createSubscriber(zr0 onEvent) {
        return new Gk(onEvent);
    }

    @NotNull
    public final List<String> getListOfTopics() {
        return this.listOfTopics;
    }

    public SignalCollector(@NotNull List<String> list) {
        list.getClass();
        this.listOfTopics = list;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance();
        appLovinCommunicator.getClass();
        this.communicator = appLovinCommunicator;
    }

    public final void setupAppLovinCommunicator(@NotNull zr0 onEvent) {
        onEvent.getClass();
        try {
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriberCreateSubscriber = createSubscriber(onEvent);
            this.communicatorSubscriber = appLovinCommunicatorSubscriberCreateSubscriber;
            this.communicator.subscribe(appLovinCommunicatorSubscriberCreateSubscriber, this.listOfTopics);
            Objects.toString(this.listOfTopics);
        } catch (Error | Exception unused) {
        }
    }
}
