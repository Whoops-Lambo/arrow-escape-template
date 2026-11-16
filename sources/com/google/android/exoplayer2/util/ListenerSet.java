package com.google.android.exoplayer2.util;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import defpackage.mw;
import defpackage.vv;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ListenerSet<T> {
    private static final int MSG_ITERATION_FINISHED = 0;
    private final Clock clock;
    private final ArrayDeque<Runnable> flushingEvents;
    private final HandlerWrapper handler;
    private final IterationFinishedEvent<T> iterationFinishedEvent;
    private final CopyOnWriteArraySet<d> listeners;
    private final ArrayDeque<Runnable> queuedEvents;
    private boolean released;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Event<T> {
        void invoke(T t);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface IterationFinishedEvent<T> {
        void invoke(T t, FlagSet flagSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        for (d dVar : this.listeners) {
            IterationFinishedEvent<T> iterationFinishedEvent = this.iterationFinishedEvent;
            if (!dVar.d && dVar.c) {
                FlagSet flagSetBuild = dVar.b.build();
                dVar.b = new FlagSet.Builder();
                dVar.c = false;
                iterationFinishedEvent.invoke((T) dVar.a, flagSetBuild);
            }
            if (this.handler.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }

    public void add(T t) {
        if (this.released) {
            return;
        }
        Assertions.checkNotNull(t);
        this.listeners.add(new d(t));
    }

    public void clear() {
        this.listeners.clear();
    }

    @CheckResult
    public ListenerSet<T> copy(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        return new ListenerSet<>(this.listeners, looper, clock, iterationFinishedEvent);
    }

    public void flushEvents() {
        if (this.queuedEvents.isEmpty()) {
            return;
        }
        if (!this.handler.hasMessages(0)) {
            HandlerWrapper handlerWrapper = this.handler;
            handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(0));
        }
        boolean zIsEmpty = this.flushingEvents.isEmpty();
        this.flushingEvents.addAll(this.queuedEvents);
        this.queuedEvents.clear();
        if (zIsEmpty) {
            while (!this.flushingEvents.isEmpty()) {
                this.flushingEvents.peekFirst().run();
                this.flushingEvents.removeFirst();
            }
        }
    }

    public void queueEvent(int i, Event<T> event) {
        this.queuedEvents.add(new vv(new CopyOnWriteArraySet(this.listeners), i, event, 6));
    }

    public void release() {
        for (d dVar : this.listeners) {
            IterationFinishedEvent<T> iterationFinishedEvent = this.iterationFinishedEvent;
            dVar.d = true;
            if (dVar.c) {
                dVar.c = false;
                iterationFinishedEvent.invoke((T) dVar.a, dVar.b.build());
            }
        }
        this.listeners.clear();
        this.released = true;
    }

    public void remove(T t) {
        for (d dVar : this.listeners) {
            if (dVar.a.equals(t)) {
                IterationFinishedEvent<T> iterationFinishedEvent = this.iterationFinishedEvent;
                dVar.d = true;
                if (dVar.c) {
                    dVar.c = false;
                    iterationFinishedEvent.invoke((T) dVar.a, dVar.b.build());
                }
                this.listeners.remove(dVar);
            }
        }
    }

    public int size() {
        return this.listeners.size();
    }

    private ListenerSet(CopyOnWriteArraySet<d> copyOnWriteArraySet, Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        this.clock = clock;
        this.listeners = copyOnWriteArraySet;
        this.iterationFinishedEvent = iterationFinishedEvent;
        this.flushingEvents = new ArrayDeque<>();
        this.queuedEvents = new ArrayDeque<>();
        this.handler = clock.createHandler(looper, new mw(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void lambda$queueEvent$0(CopyOnWriteArraySet copyOnWriteArraySet, int i, Event event) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (!dVar.d) {
                if (i != -1) {
                    dVar.b.add(i);
                }
                dVar.c = true;
                event.invoke(dVar.a);
            }
        }
    }

    public void sendEvent(int i, Event<T> event) {
        queueEvent(i, event);
        flushEvents();
    }

    @CheckResult
    public ListenerSet<T> copy(Looper looper, IterationFinishedEvent<T> iterationFinishedEvent) {
        return copy(looper, this.clock, iterationFinishedEvent);
    }

    public ListenerSet(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        this(new CopyOnWriteArraySet(), looper, clock, iterationFinishedEvent);
    }
}
