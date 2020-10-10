package net.barribob.invasion.mob

import net.barribob.maelstrom.animation.client.GeckolibAnimationManager
import net.barribob.maelstrom.animation.client.IAnimationRegister
import software.bernie.geckolib.animation.builder.AnimationBuilder

class MaelstromScoutAnimations : IAnimationRegister<MaelstromScoutEntity> {
    override fun registerAnimations(animationManager: GeckolibAnimationManager<MaelstromScoutEntity>) {
        animationManager.registerAnimation("attack") { controller, _ ->
            controller.setAnimation(AnimationBuilder().addAnimation("attack2"))
            true
        }

        animationManager.registerAnimation("idle_arms") { controller, _ ->
            controller.setAnimation(AnimationBuilder().addAnimation("idle_arms"))
            true
        }

        animationManager.registerAnimation("float") { controller, _ ->
            controller.setAnimation(AnimationBuilder().addAnimation("float"))
            true
        }
    }
}