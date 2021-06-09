using NUnit.Framework;
using System.Drawing;
using eu.sig.training.ch06.simpledigitalcamera;

namespace eu.sig.training.ch10
{

    [TestFixture]
    public class PerfectPictureTest
    {
        [Test]
        public void TestDayPicture()
        {
            Image image = Image.FromFile("../../../../test/resources/VanGoghSunflowers.jpg");
            DigitalCameraStub cameraStub = new DigitalCameraStub();
            cameraStub.TestImage = image;
            PerfectPicture.camera = cameraStub;
            Assert.AreSame(image, new PerfectPicture().TakePerfectPicture(12));
        }

        [Test]
        public void TestNightPicture()
        {
            Image image = Image.FromFile("../../../../test/resources/VanGoghStarryNight.jpg");
            DigitalCameraMock cameraMock = new DigitalCameraMock();
            cameraMock.TestImage = image;
            PerfectPicture.camera = cameraMock;
            Assert.AreSame(image, new PerfectPicture().TakePerfectPicture(0));
            Assert.AreEqual(1, cameraMock.FlashOnCounter);
        }
    }

    class DigitalCameraStub : ISimpleDigitalCamera
    {
        public Image TestImage;

        public Image TakeSnapshot()
        {
            return this.TestImage;
        }

        public void FlashLightOn()
        {
        }

        public void FlashLightOff()
        {
        }
    }

    class DigitalCameraMock : ISimpleDigitalCamera
    {
        public Image TestImage;
        public int FlashOnCounter = 0;

        public Image TakeSnapshot()
        {
            return this.TestImage;
        }

        public void FlashLightOn()
        {
            this.FlashOnCounter++;
        }

        public void FlashLightOff()
        {
        }
    }
}
