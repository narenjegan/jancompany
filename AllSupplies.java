public class AllSupplies {
    public static void main(String[] args) {

        supplies Muzzleloader = new supplies("Muzzleloader", 800, "The shooter must load this type of rifle from the front end of its barrel – i.e. the muzzle. For every shot fired the shooter must insert powder and a ball or bullet down the barrel, as well as insert a new percussion cap to provide ignition.\n" +
                "\n" +
                "The muzzleloader works on a similar principle to Revolutionary War era rifles. Its slow rate of fire and relatively complex reloading process make it totally obsolete as far as combat and self-defense are concerned. Modern muzzleloader rifles are usually favored by hunters who seek a more challenging or old-fashioned experience.");

        supplies SingleShot = new supplies("Single-Shot Rifle", 600, "A single shot rifle holds a single round of ammunition, and it holds it right in its chamber. The shooter must manually reload a single shot rifle after firing every single shot. Its simplistic design means that a single-shot rifle does not need a very large receiver. It also has very few moving parts that could fail. Common types of single shot rifles are the bolt-action, break-action, muzzleloader, and lever-action. Less common types of rifles that are single shot include the rolling block, trapdoor, and drop blocks/falling block.\n" +
                "\n" +
                "Their slow rate of fire (which can be significantly sped up by a skilled shooter) restricts single-shot rifles to precision shooting and hunting applications, although survival and plinking single-shot rifles are commonly chambered for 22 LR. A single-shot rifle is also a good choice for teaching a younger shooter, partly because an unintentional discharge cannot fire multiple rounds of ammo.");

        supplies BoltAction = new supplies("Bolt-Action Rifle", 1300, "This type of rifle has a manual action. By pulling its bolt backward, you eject the spent case. By returning the bolt forward, you chamber a new round. A bolt-action rifle may feed rounds from a magazine or require the shooter to insert each new round into the chamber by hand.\n" +
                "\n" +
                "A bolt-action rifle has a very slow rate of fire compared to more modern rifle designs. But it is highly reliable, and its action’s solid and minimalistic design promotes better accuracy than an automatic or a semi-automatic can typically achieve. As such, bolt-action rifles are favored by precision shooters and hunters. That’s because they want to do the job with a single shot.");

    }
}
