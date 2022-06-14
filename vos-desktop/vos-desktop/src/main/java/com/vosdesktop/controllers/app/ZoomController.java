package com.vosdesktop.controllers.app;

import com.vosdesktop.actions.GuiAction;
import com.vosdesktop.constants.GuiConstants;

import java.awt.geom.AffineTransform;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class ZoomController implements Serializable {

    protected PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private int percent;

    public ZoomController(int percent) {
        this.percent = percent;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public AffineTransform getTransform() {
        return AffineTransform.getScaleInstance(percent * 0.01, percent * 0.01);
    }

    public double getScaleFactor() {
        return percent * 0.01;
    }

    public boolean canZoomOut() {
        int newPercent = percent - GuiConstants.ZOOM_DELTA;
        return newPercent >= GuiConstants.ZOOM_MIN;
    }

    public void zoomOut() {
        if(canZoomOut()) {
            int old = percent;
            percent -= GuiConstants.ZOOM_DELTA;
            changeSupport.firePropertyChange("zoomOut", old, percent);
        }
    }

    public boolean canZoomIn() {
        int newPercent = percent + GuiConstants.ZOOM_DELTA;
        return newPercent <= GuiConstants.ZOOM_MAX;
    }

    public void zoomIn() {
        if (canZoomIn()) {
            int old = percent;
            percent += GuiConstants.ZOOM_DELTA;
            changeSupport.firePropertyChange("zoomIn", old, percent);
        }
    }

    public int getPercent() {
        return percent;
    }

    private void setPercent(int newPercent) {
        if (newPercent >= GuiConstants.ZOOM_MIN && newPercent <= GuiConstants.ZOOM_MAX) {
            percent = newPercent;
        }
    }

    public void setZoom(int newPercent) {
        setPercent(newPercent);
    }
}
