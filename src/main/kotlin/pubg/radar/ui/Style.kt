package pubg.radar.ui

import com.badlogic.gdx.graphics.Color
import pubg.radar.gridWidth
import pubg.radar.mapWidth

const val initialWindowWidth = 1000f
const val windowToMapUnit = mapWidth / initialWindowWidth

const val runSpeed = 6.3 * 100//6.3m/s
const val unit = gridWidth / 8
const val unit2 = unit / 10
//1m=100
const val playerRadius = 4000f
const val healthBarWidth = 15000f
const val healthBarHeight = 2000f
const val vehicle2Width = 400f
const val vehicle4Width = 800f
const val vehicle6Width = 1600f
const val directionRadius = 16000f
const val airDropRadius = 4000f
const val corpseRadius = 150f
const val itemRadius = 100f
const val visionRadius = mapWidth / 8
const val fov = 90f

const val aimLineWidth = 1000f
const val aimLineRange = 50000f
const val aimCircleRadius = 200f
const val aimTimeThreshold = 1000
const val attackLineDuration = 1000
const val attackMeLineDuration = 10000
const val pinRadius = 4000f

val selfColor = Color(0x32cd32ff)
val teamColor = Color(0.27f, 0.0f, 0.55f, 1f)
val safeDirectionColor = Color(0.12f, 0.56f, 1f, 0.5f)
val visionColor = Color(1f, 1f, 1f, 0.1f)
val corpseColor = Color(1f, 1f, 0f, 1f)
val carColor = Color(0.12f, 0.56f, 1f, 0.9f)
val boatColor = Color(1f, 0.49f, 0f, 0.9f)
val planeColor = Color(0.93f, 0.90f, 0f, 1.0f)
val parachuteColor = Color(0.94f, 1.0f, 1.0f, 1f)
val playerColor = Color.RED!!

val normalItemColor = Color(1.0f, 1.0f, 0.5f, 1.0f) //jaune
val m416ItemColor = Color(0.5f, 0.25f, 0.0f, 1.0f) //Marron
val scarItemColor = Color(0.5f, 0.26f, 0.1f, 1.0f) //Marron
val extendedItemColor = Color(0.5f, 1.0f, 1.0f, 1.0f) //Bleu ciel
val armor3ItemColor = Color(0.12f, 0.1f, 1.0f, 1.0f) //Bleu fonce
val suppressorItemColor = Color(0.5f, 0.24f, 0.1f, 1.0f) //Marron
val kar98kItemColor = Color(0.51f, 0.26f, 0.0f, 1.0f) // Marron
val scope8xItemColor = Color(0.5f, 0.5f, 1.0f, 1.0f) //Lavande
val miniItemColor = Color(0.50f, 1.0f, 0.99f, 1.0f) //Bleu ciel
val helmet3ItemColor = Color(0.13f,	0.11f, 1.0f, 1.0f) //Bleu fonce
val scope4xItemColor = Color(0.51f,	1.0f, 0.99f, 1.0f) //Bleu ciel
val bagItemColor = Color(0.55f,	0.55f,	0.55f, 1.0f) //Gris
val healItemColor = Color(0.3f, 0.85f, 0.0f, 1.0f) //Vert
val gripItemColor = Color(0.25f, 0.25f, 0.25f, 1.0f) //Gris fonce
val sksItemColor = Color(0.12f, 0.11f, 1.0f, 1.0f) //Bleu fonce

val sightColor = Color(1f, 1f, 1f, 0.6f)
val aimLineColor = Color(0f, 0f, 1f, 1f)
val attackLineColor = Color(1.0f, 0f, 0f, 1f)
val pinColor = Color(1f, 1f, 0f, 1f)
val redZoneColor = Color(1f, 0f, 0f, 0.2f)
val safeZoneColor = Color(1f, 1f, 1f, 0.5f)