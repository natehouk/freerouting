/*
 *   Copyright (C) 2014  Alfons Wirtz
 *   website www.freerouting.net
 *
 *   Copyright (C) 2017 Michael Hoffer <info@michaelhoffer.de>
 *   Website www.freerouting.mihosoft.eu
*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License at <http://www.gnu.org/licenses/> 
 *   for more details.
 *
 * RouteMenuState.java
 *
 * Created on 29. November 2003, 07:50
 */

package eu.mihosoft.freerouting.interactive;

import eu.mihosoft.freerouting.geometry.planar.FloatPoint;

/**
 * Class implementing the different functionality in the route menu,
 * especially the different behaviour of the mouse button 1.
 *
 * @author Alfons Wirtz
 */
public class RouteMenuState extends MenuState
{
    /** Returns a new instance of RouteMenuState */
    public static RouteMenuState get_instance(BoardHandling p_board_handling, ActivityReplayFile p_activityReplayFile)
    {
        RouteMenuState new_state = new RouteMenuState(p_board_handling, p_activityReplayFile);
        return new_state;
    }
    
    /** Creates a new instance of RouteMenuState */
    private RouteMenuState(BoardHandling p_board_handling, ActivityReplayFile p_activityReplayFile)
    {
        super(p_board_handling, p_activityReplayFile);
    }
    
    public InteractiveState left_button_clicked(FloatPoint p_location)
    {
        return RouteState.get_instance(p_location, this, hdlg, activityReplayFile);
    }
    
    public void display_default_message()
    {
        hdlg.screen_messages.set_status_message(" in route menu");
    }
    
    public String get_help_id()
    {
        return "MenuState_RouteMenuState";
    }
    
}
