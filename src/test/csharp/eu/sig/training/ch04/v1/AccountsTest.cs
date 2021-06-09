using NUnit.Framework;

namespace eu.sig.training.ch04.v1
{
    [TestFixture]
    public class AccountsTest
    {
        [Test]
        public void TestIsValidNormalCases()
        {
            Assert.IsTrue(Accounts.IsValid("123456789"));
            Assert.IsFalse(Accounts.IsValid("123456788"));
        }

        [Ignore("Deliberately fails for illustration purpose")]
        [Test]
        public void TestEmptyString()
        {
            Assert.IsFalse(Accounts.IsValid(""));
        }

#pragma warning disable 219
        [Ignore("Deliberately fails for illustration purpose")]
        [Test]
        public void ShowError()
        {
            int tmp = 0, dummy = 1 / tmp;
            // Next line is never executed because the previous one raises an exception.
            // If it were executed, you'll never see the assert message because the test always succeeds.
            Assert.IsTrue(true);
        }
#pragma warning restore 219
    }
}
